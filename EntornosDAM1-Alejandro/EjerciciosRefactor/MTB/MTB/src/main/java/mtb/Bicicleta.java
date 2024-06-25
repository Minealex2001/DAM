package mtb;

public class Bicicleta {
    protected int cadencia;
protected int marcha;
protected int velocidad;

public Bicicleta(int cadenciaIni, int velocidadIni, int marchaIni) {
    this.marcha = marchaIni;
    this.cadencia = cadenciaIni;
    this.velocidad = velocidadIni;
}

public void setCadencia(int nuevoValor) {
    this.cadencia = nuevoValor;
}

public void setMarcha(int nuevaMarcha) {
    this.marcha = nuevaMarcha;
}

public void frenar(int decremento) {
    this.velocidad -= decremento;
}

public void acelerar(int incremento) {
    this.velocidad += incremento;
}

public int getCadencia() {
    return this.cadencia;
}

public int getMarcha() {
    return this.marcha;
}

public int getVelocidad() {
    return this.velocidad;
}
}