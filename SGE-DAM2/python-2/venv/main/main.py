def ejercicio_1():
    print("Ingrese las notas de los alumnos N1, N2, N3")
    n1 = int(input("Ingrese la nota de N1: "))
    n2 = int(input("Ingrese la nota de N2: "))
    n3 = int(input("Ingrese la nota de N3: "))
    promedio = (n1 + n2 + n3) / 3
    print("El promedio es: ", promedio)


def ejercicio_2():
    base = int(input("Ingrese la base del rectangulo: "))
    altura = int(input("Ingrese la altura del rectangulo: "))
    perimetro = (base + altura) * 2
    superficie = base * altura
    print("El perimetro es: ", perimetro)
    print("La superficie es: ", superficie)


def ejercicio_3():
    print("Ingrese 2 numeros")
    x = int(input("Ingrese el primer numero: "))
    y = int(input("Ingrese el segundo numero: "))
    if x > y:
        print("El numero mayor es: ", x)
    else:
        print("El numero mayor es: ", y)


def ejercicio_4():
    ano = int(input("Ingrese un año: "))
    if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
        print("El año es bisiesto")
    else:
        print("El año no es bisiesto")


def ejercicio_5():
    print("Ingresa 3 numeros")
    a = int(input("Ingrese el primer numero: "))
    b = int(input("Ingrese el segundo numero: "))
    c = int(input("Ingrese el tercer numero: "))
    if a > b:
        if a > c:
            if b > c:
                print(a, b, c)
            else:
                print(a, c, b)
        else:
            print(c, a, b)
    else:
        if b > c:
            if a > c:
                print(b, a, c)
            else:
                print(b, c, a)
        else:
            print(c, b, a)


def ejercicio_6():
    c = -1
    i = -1
    m = -1
    while c < 0 and (i <= 0 or i > 100) and m <= 100:
        print("Ingrese el capital, el interes y el tiempo apropiados")
        c = float(input("Ingrese el capital: "))
        i = float(input("Ingrese el interes: "))
        m = float(input("Ingrese el tiempo: "))

    for j in range(int(m - 1)):
        c = c * (1 + i / 100)

    print("El capital final es: ", round(c, 3), "€")


def ejercicio_7():
    x = int(input("Ingresa el valor de X: "))
    e = 1
    num = 1
    den = 1
    i = 1
    t = True
    while t:
        num = num * x
        den = den * i
        e = e + num / den
        i = i + 1
        if (num / den) < 0.000001:
            break

    print("El valor de e elevado a ", x, " es: ", e)


def ejercicio_8():
    b = int(2)

    for i in range(2, 29):
        co = int(0)
        if not(b % 2 == 0) or b == 2:
            for a in range(2, int(b/2)):
                if b % a == 0:
                    co += 1
                    a = b
            if co == 0:
                print(f'El cubo de {b} es {pow(b, 3)}')
        b += 1

def ejercicio_9():
    ce = int(input("Ingrese la cantidad de empleados: "))
    i = 1
    c = 0
    smayor = float(0)
    print("Ingrese los sueldos")
    for i in range(ce):
        sueldo = float(input("Sueldo: "))
        if sueldo > smayor:
            smayor = sueldo
            c = i
        i = i + 1

    print("El empleado con el sueldo mayor es el ", c, " con un sueldo de ", smayor)


def ejercicio_10():
    n = int(input("Ingrese la cantidad de temperaturas: "))
    suma = 0
    media = 0
    registroTemp = []
    c = 0
    for i in range(n):
        temp = float(input("Ingrese la temperatura: "))
        registroTemp.append(temp)
        suma = suma + temp

    media = suma / n
    for i in range(n):
        if registroTemp[i] >= media:
            c = c + 1
            print(registroTemp[i])

    print("La media es: ", media)
    print("La cantidad de temperaturas mayores a la media es: ", c)