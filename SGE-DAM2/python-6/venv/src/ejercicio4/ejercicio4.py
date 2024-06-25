
value = input("Ingrese un valor: ")

myset = {1, 3, 4, 5, 7, 9}

if value in myset:
    print("El valor {} no está presente en el conjunto.".format(value))
else:
    print("El valor {} está presente en el conjunto.".format(value))
