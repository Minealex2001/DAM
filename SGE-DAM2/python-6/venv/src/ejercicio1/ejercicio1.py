import sys
import timeit

mylist = [1, 3, 4, 5, "hello", True]
mytuple = (1, 3, 4, 5, "hello", True)


def accesoalalista():
    return mylist[3]


def accesoalatupla():
    return mytuple[3]


def join_list_and_tuple():
    new_list = list(mylist) + list(mytuple)
    return new_list


listtamano = sys.getsizeof(mylist)
tupletamano = sys.getsizeof(mytuple)

if listtamano > tupletamano:
    print("La lista ocupa más memoria que la tupla")
else:
    print("La tupla ocupa más memoria que la lista")

print(timeit.timeit(join_list_and_tuple, number=100000))
