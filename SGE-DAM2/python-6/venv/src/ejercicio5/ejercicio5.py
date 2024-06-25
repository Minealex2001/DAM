my_set_1 = {1, 3, 4, 5, 7, 9}
my_set_2 = {10, 11, 12, 13, 14, 15}


if my_set_1.isdisjoint(my_set_2):
    print("The two sets have no elements in common.")
else:
    print("The two sets have at least one element in common.")
