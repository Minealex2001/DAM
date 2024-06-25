def remove_intersection(set_a, set_b):

    intersection = set_a.intersection(set_b)
    set_a -= intersection
    return set_a



set_a = {1, 3, 4, 5, 7, 9}
set_b = {3, 4, 5, 7}

set_a = remove_intersection(set_a, set_b)

print(set_a)


