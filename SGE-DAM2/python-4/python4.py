import sys
import timeit

mylist=[1, 3, 4, 5,"hello",True]
mytuple=(1, 3, 4, 5,"hello",True)

def accesoalalista():
    return mylist[3]

def accesoalatupla():
    return mytuple[3]

tiempodeaccesoalista = timeit.timeit(accesoalalista, number=1000000)
tiempodeaccesoatupla = timeit.timeit(accesoalatupla, number=1000000)

listtamano = sys.getsizeof(mylist)
tupletamano = sys.getsizeof(mytuple)

# Imprimir los resultados
print("Tiempo de acceso a un elemento en la lista: ", tiempodeaccesoalista)
print("Tiempo de acceso a un elemento en la tupla: ", tiempodeaccesoatupla)
print("Tamaño de la lista en memoria: ", listtamano)
print("Tamaño de la tupla en memoria: ", tupletamano)

def unirlistfor():
    my_string = ''
    for element in mylist:
        my_string += element
    return my_string


def unirtuplafor():
    my_string = ''
    for element in mytuple:
        my_string += element
    return my_string


tiempounirlistafor = timeit.timeit(lambda: unirlistfor, number=1000000)
tiempounirtuplafor = timeit.timeit(lambda: unirtuplafor, number=1000000)
print("Tiempo de acceso y unión con un bucle for y concatenación de cadenas utilizando una lista: ", tiempounirlistafor)
print("Tiempo de acceso y unión con un bucle for y concatenación de cadenas utilizando una tupla: ", tiempounirtuplafor)

tiempo_mylist_join = timeit.timeit(lambda: "".join(map(str, mylist)), number=1000000)
tiempo_mytuble_join = timeit.timeit(lambda: "".join(map(str, mytuple)), number=1000000)

print("Tiempo de acceso y unión con el método join() utilizando una lista: ", tiempo_mylist_join)
print("Tiempo de acceso y unión con el método join() utilizando una tupla: ", tiempo_mytuble_join)