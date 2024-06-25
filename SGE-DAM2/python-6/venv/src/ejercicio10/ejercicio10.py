def find_missing_numbers(set1, set2):
    missing_numbers_in_set1 = set1.difference(set2)
    missing_numbers_in_set2 = set2.difference(set1)
    return missing_numbers_in_set1, missing_numbers_in_set2


set1 = {1, 3, 4, 5, 7, 9}
set2 = {3, 4, 5, 7}

missing_numbers_in_set1, missing_numbers_in_set2 = find_missing_numbers(set1, set2)

print("Missing numbers in set1:", missing_numbers_in_set1)
print("Missing numbers in set2:", missing_numbers_in_set2)
