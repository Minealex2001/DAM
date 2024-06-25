import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuesta1=0, respuesta2=1, respuesta3=1,  respuesta4 = 0, respuesta51 = 1 , respuesta52 = 1 , respuesta53 = 0, respuestaleida;
        String Nivel = "Nivel1";
        //Introduccion
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS === "+
        "Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke "+
        "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada "+
        "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio "+
        "está construyendo para destruirla. (Presiona Intro para continuar) ");
        try{System.in.read();}
        catch(Exception e){}
        do{
            switch (Nivel){
            //Nivel 1 
            case "Nivel1":
            //Calculo los numeros aleatorios y la respuesta de la pregunta
            int S1 = (int) (1 + Math.random() * (10+1));
            int S2 = (int) (20 + Math.random() * (30-20+1));

            for(int c=S1; c<=S2; c++){
                respuesta1 = respuesta1 + c;
            }

            System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al "+
            "sistema "+S1+" en el sector "+S2+" , pero el sistema de navegación está estropeado y el "+
            "computador tiene problemas para calcular parte de las coordenadas de salto. "+
            "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie. "+
            "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que "+
            "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive). "+
            "¿Qué debe introducir?");
            respuestaleida = entrada.nextInt();
            //Compruebo que la respuesta sea correcta
            if(respuestaleida!=respuesta1){
                Nivel = "Fallo";
            } else {
                Nivel = "Nivel2";
            }

            break;

            case "Nivel2":
            //Nivel 2 
            //Calculo los numeros aleatorios y la respuesta de la pregunta            
            int P1 = (int) (Math.random() * (7+1));
            int P2 = (int) (8 + Math.random() * (12-8+1));

            for(int c=P1; c<=P2; c++){
                respuesta2 = respuesta2 * c;
            }

            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella "+
            "de la muerte. Como van en una nave imperial robada se aproximan lentamente con "+
            "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí "+
            "agente de espaciopuerto "+P1+" contactando con nave imperial "+P2+". No están destinados "+
            "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. "+
            "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso "+
            "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde "+
            "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el "+
            "manual del piloto que estaba en la guantera y da con la página correcta. El código "+
            "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive)."+
            "¿Cuál es el código?");
            respuestaleida = entrada.nextInt();
            //Compruebo que la respuesta sea correcta
            if(respuestaleida!=respuesta2){
                Nivel = "Fallo";
            } else {
                Nivel = "Nivel3";
            }

            break;

            //Nivel 3
            case "Nivel3":
            //Calculo los numeros aleatorios y la respuesta de la pregunta
            int N = (int) (((50 + Math.random() * (100-50+1)))/10);

            for(int c=1; c<=N; c++){
                respuesta3 = respuesta3 * c;
            }

            System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se "+
            "equipan con trajes de soldados imperiales que encuentran en la nave para pasar" +
            "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los "+ N +" existentes se" +
            "encuentra el reactor principal. Se dirigen al primer panel computerizado que" +
            "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita " +
            "introducir una clave de acceso. Entonces recuerda la información que le proporcionó " +
            "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10 " +
            "(redondeando N hacia abajo), donde N es el nº de niveles”."+
            "¿Cual es el nivel correcto?");
            respuestaleida = entrada.nextInt();
            //Compruebo que la respuesta sea correcta
            if(respuestaleida!=respuesta3){
                Nivel = "Fallo";
            } else {
                Nivel = "Nivel4";
            }

            break;

            //Nivel 4
            case "Nivel4":
            //Calculo los numeros aleatorios y la respuesta de la pregunta
            int P = (int) (10 + Math.random() * (100-10+1));

            double raiz = Math.sqrt(P);
            for(int c = 2; c <= raiz; c++){
           
                if(P % c == 0){
                    respuesta4 = 1;
                }
            }
            System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta "+
            "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para "+
            "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita " +
            "verificar si el número "+P+" es primo o no. Si es primo introduce un 1, si no lo es "+
            "introduce un 0. ");
            respuestaleida = entrada.nextInt();
            //Compruebo que la respuesta sea correcta
            if(respuestaleida!=respuesta4){
                Nivel = "Fallo";
            } else {
                Nivel = "Nivel5";
            }

            break;

            //Nivel 5
            case "Nivel5":
            //Calculo los numeros aleatorios y la respuesta de la pregunta
            int M = (int) (5 + Math.random() * (10-5+1));
            int S = (int) (5 + Math.random() * (10-5+1));

            for(int c=1; c<=M; c++){
                respuesta51 = respuesta51 * c;
            }
            for(int c=1; c<=S; c++){
                respuesta52 = respuesta52 * c;
            }
            respuesta53 = respuesta51 + respuesta52;

            System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,"+
            "programe el temporizador y salir de allí corriendo. Necesita programarlo para que "+
            "explote en exactamente "+M+" minutos y "+S+" segundos, el tiempo suficiente para escapar "+
            "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y "+
            "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto "+
            "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar "+
            "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");
            respuestaleida = entrada.nextInt();
            //Compruebo que la respuesta sea correcta
            if(respuestaleida!=respuesta53){
                Nivel = "Fallo";
            } else {
                Nivel = "Ganar";
            }
        
        }
        //Compruebo si el juego ha terminado o continua
        }while(!Nivel.equalsIgnoreCase("Fallo")&&!Nivel.equalsIgnoreCase("Ganar"));
        //Compruebo si ha fallado el juego
        if(Nivel.equalsIgnoreCase("Fallo")){
            System.out.print("Ese no era el código correcto… La misión ha sido un fracaso...:( :( :( "+
                            "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }else {
            System.out.print("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a "+
            "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se "+
            "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea "+
            "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan "+
            "observan por la ventana la imagen de la colosal estrella de la muerte explotando en" +
            "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado"+
            "imperio."+
            "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
        }
        System.out.print(" Gracias por jugar :D");
        entrada.close();
    }
}

