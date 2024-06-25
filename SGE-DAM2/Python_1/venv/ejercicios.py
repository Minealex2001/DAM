def ejercicio_1():
    nombre = input("Cual es tu nombre: ")
    print("Hola, " + nombre)


def ejercicio_2():
    n = int(input("Que numero quieres: "))
    if (n > 0):
        for x in range(n):
            suma = n * (n + 1) / 2

    print(suma)


def ejercicio_3():
    dinero = int(input("Cuanto dinero tienes"))

    dinero1 = dinero * 1.04
    dinero2 = dinero1 * 1.04
    dinero3 = dinero2 * 1.04

    print("El primer año tendras: " + dinero1)
    print("El segundo año tendras: " + dinero2)
    print("El tercer año tendras: " + dinero3)


def ejercicio_4bucle():
    nombre = input("Introduce tu nombre: ")
    numero = int(input("Introduce un número: "))

    for i in range(numero):
        print(nombre)


def ejercicio_4nobucle():
    nombre = input("Introduce tu nombre: ")
    numero = int(input("Introduce un número: "))

    print(nombre * numero)


def ejercicio_5():
    nombre = input("Introduce tu nombre: ")
    nombre = nombre.upper()
    n_letras = len(nombre)
    print(f"{nombre} tiene {n_letras} letras")


def ejercicio_6():
    numero = input("Introduce el numero de telefono con el formato prefijo-numero-extension ")
    numero = numero[3:-3]
    print(numero)


def ejercicio_7():
    frase = input("Introduce una frase: ")
    vocal = input("Introduce una vocal: ")
    frase = frase.replace(vocal, vocal.upper())
    print(frase)


def ejercicio_8():
    precio = float(input("Introduce el precio del producto: "))
    euros = int(precio)
    centimos = precio - euros
    centimos = round(centimos, 2)
    centimos = centimos * 100
    print(f"El precio es {euros} euros y {centimos} centimos")


def ejercicio_9():
    password = "contraseña"
    password_usuario = input("Introduce la contraseña: ")
    password_usuario = password_usuario.lower()
    if password == password_usuario:
        print("El password es correcto")
    else:
        print("El password no coincide")


def ejercicio_10():
    edad = int(input("Introduce tu edad: "))
    ingresos = float(input("Introduce tus ingresos: "))
    if edad > 16 and ingresos >= 1000:
        print("Tienes que tributar")
    else:
        print("No tienes que tributar")


def ejercicio_11():
    renta_anual = float(input("Introduce tu renta anual: "))
    if renta_anual < 10000:
        print("Tipo impositivo del 5%")
    elif 10000 <= renta_anual < 20000:
        print("Tipo impositivo del 15%")
    elif 20000 <= renta_anual < 35000:
        print("Tipo impositivo del 20%")
    elif 35000 <= renta_anual < 60000:
        print("Tipo impositivo del 30%")
    elif renta_anual >= 60000:
        print("Tipo impositivo del 45%")


def ejercicio_12():
    ingredientes_vegetarianos = ["Pimiento", "Tofu"]

    ingredientes_no_vegetarianos = ["Peperoni", "Jamón", "Salmón"]

    tipo_pizza = input("¿Quieres una pizza vegetariana o no vegetariana? (v/n): ")

    if tipo_pizza == "v":

        print("Ingredientes vegetarianos disponibles:")
        for ingrediente in ingredientes_vegetarianos:
            print(ingrediente)

        ingrediente_elegido = input("Elige un ingrediente vegetariano: ")

        if ingrediente_elegido in ingredientes_vegetarianos:

            print("Pizza elegida: Vegetariana con Tomate y ", ingrediente_elegido)

        else:
            print("Ingrediente no válido")

    else:

        print("Ingredientes no vegetarianos disponibles:")
        for ingrediente in ingredientes_no_vegetarianos:
            print(ingrediente)

        ingrediente_elegido = input("Elige un ingrediente no vegetariano: ")

        if ingrediente_elegido in ingredientes_no_vegetarianos:

            print("Pizza elegida: No vegetariana con Mozzarella, Tomate y ", ingrediente_elegido)

        else:
            print("Ingrediente no válido")


def ejercicio_13():
    cantidad_invertida = float(input("Introduce la cantidad a invertir: "))

    interes_anual = float(input("Introduce el interés anual: "))

    numero_años = int(input("Introduce el número de años: "))

    capital = cantidad_invertida

    for i in range(numero_años):
        capital = capital * (1 + interes_anual / 100)
        print("Capital tras {} años: {}".format(i + 1, round(capital, 2)))


def ejercicio_14():
    contraseña = "contraseña"

    while True:

        contraseña_introducida = input("Introduce la contraseña: ")

        if contraseña_introducida == contraseña:

            break

        else:
            print("Contraseña incorrecta")

    print("Contraseña correcta")


def ejercicio_15():
    frase = input("Introduce una frase: ")

    letra = input("Introduce una letra: ")

    n_apariciones = frase.count(letra)

    print("La letra {} aparece {} veces en la frase '{}'".format(letra, n_apariciones, frase))


def ejercicio_16():
    frase = input("Introduce una frase: ")

    letra = input("Introduce una letra: ")

    palabras = frase.split(" ")

    ocurrencias = []
    for palabra in palabras:
        ocurrencias.append(palabra.count(letra))

    n_apariciones = sum(ocurrencias)

    print("La letra {} aparece {} veces en la frase '{}'".format(letra, n_apariciones, frase))


def ejercicio_17():
    while True:

        entrada = input("Introduce algo: ")

        if entrada == "salir":
            break

        print(entrada)


def ejercicio_18():
    frase = input("Introduce una frase: ")

    frase_invertida = invertir_cadena(frase)

    print(frase_invertida)


def expo(base, exponente):
    if not isinstance(base, int) or base < 1:
        raise ValueError("Base debe ser un entero positivo")
    if not isinstance(exponente, int) or exponente < 1:
        raise ValueError("Exponente debe ser un entero positivo")

    result = 1
    for i in range(exponente):
        result *= base

    return result


def ejercicio_19():
    base = int(input("Introduce la base: "))

    exponente = int(input("Introduce el exponente: "))

    resultado = expo(base, exponente)

    print("El resultado es:", resultado)


def aplicar_descuento(precio, descuento):
    descuento_en_euros = precio * descuento / 100

    return precio - descuento_en_euros


def aplicar_iva(precio, iva):
    iva_en_euros = precio * iva / 100

    return precio + iva_en_euros


def calcular_precio_final(cesta, funcion_aplicacion):
    precio_final = 0

    for producto, precio in cesta.items():
        precio_aplicado = funcion_aplicacion(precio, cesta[producto + "_descuento"])

        precio_final += precio_aplicado

    return precio_final


def ejercicio_20():
    cesta = {
        "producto1": 100,
        "producto2": 200,
        "producto3": 300,
    }

    descuento = 10

    precio_final = calcular_precio_final(cesta, aplicar_descuento)

    print(precio_final)
