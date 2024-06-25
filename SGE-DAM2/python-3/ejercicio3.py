def ejercicio_1():
    asignaturas = ["Matemáticas", "Física", "Química", "Historia", "Lengua"]
    notas = []
    for asignatura in asignaturas:
        notas.append(input("¿Qué nota has sacado en " + asignatura + "? "))

    for asignatura in asignaturas:
        print("En " + asignatura + " has sacado " + notas[asignaturas.index(asignatura)])

    notaMedia = sum([int(nota) for nota in notas]) / len(notas)

    print(f'Tu nota media es {str(notaMedia)}')


def ejercicio_2():
    palabra = input("Introduce una palabra: ")
    palabralower = palabra.lower()
    a, e, i, o, u = 0, 0, 0, 0, 0
    for letra in palabra:
        if letra == "a":
            a += 1
        elif letra == "e":
            e += 1
        elif letra == "i":
            i += 1
        elif letra == "o":
            o += 1
        elif letra == "u":
            u += 1
    print(f'La palabra {palabra} tiene {a} a, {e} e, {i} i, {o} o, {u} u')

    palabra_invertida = ""
    for i in range(len(palabralower) - 1, -1, -1):
        palabra_invertida += palabra[i]

    if palabra == palabra_invertida:
        print("La palabra es un palíndromo.")
    else:
        print("La palabra no es un palíndromo.")


def ejercicio_3():
    platos = {
        "Pasta": {
            "Espaguetis": 7,
            "Macarrones": 7,
            "Fusili": 8
        },
        "Pizza": {
            "Clasica": 8,
            "Integral": 9
        },
        "Salas": {
            "Carbonara": 3,
            "Rabiosa": 2,
            "Pesto Verde": 2.75,
            "Pesto Rojo": 3,
            "Boloñesa": 2.5
        },
        "Postres": {
            "Tiramisú": 6,
            "Panna Cotta": 5.5,
        }
    }
    IngredientesPizza = {
        "Extra de queso": 1,
        "Queso azul": 2,
        "Salchicha": 1.5,
        "Carne": 2,
        "Chorizo": 2.5,
        "Jamón": 3,
        "Pimiento Verde": 1,
        "Aceitunas": 1.5,
        "Anchoas": 3,
        "Atún": 2.5,
        "Salmón": 3,
        "Piña": 1.5
    }

    precio = 0

    if input("¿Quieres pasta? ") == "si":
        print(platos["Pasta"])
        pasta = input("¿Qué pasta quieres? ")
        if pasta in platos["Pasta"]:
            precio += platos["Pasta"][pasta]
            if input("¿Quieres salsa? ") == "si":
                print (platos["Salas"])
                salsa = input("¿Qué salsa quieres? ")
                if salsa in platos["Salas"]:
                    precio += platos["Salas"][salsa]
    if input("¿Quieres pizza? ") == "si":
        print(platos["Pizza"])
        pizza = input("¿Qué pizza quieres? ")
        if pizza in platos["Pizza"]:
            precio += platos["Pizza"][pizza]
            for i in range(5):
                print(IngredientesPizza)
                ingrediente = input("¿Qué ingrediente quieres? ")
                if ingrediente in IngredientesPizza:
                    precio += IngredientesPizza[ingrediente]
                if i < 4:
                    if input("¿Quieres más ingredientes? ") == "no":
                        break
    if input("¿Quieres postre? ") == "si":
        print(platos["Postres"])
        postre = input("¿Qué postre quieres? ")
        if postre in platos["Postres"]:
            precio += platos["Postres"][postre]


    print(f'El precio es {precio} €')
ejercicio_3()


