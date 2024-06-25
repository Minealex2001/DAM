def find_max_product_pair(list1):
    products = set()

    for i in range(len(list1)):
        for j in range(i + 1, len(list1)):
            products.add(list1[i] * list1[j])

    max_product = max(products)

    for i in range(len(list1)):
        for j in range(i + 1, len(list1)):
            if list1[i] * list1[j] == max_product:
                return list1[i], list1[j]

    return None


list1 = [1, 3, 4, 5, 7, 9]
max_product_pair = find_max_product_pair(list1)

if max_product_pair is not None:
    print("The two numbers whose product is maximum are {} and {}.".format(max_product_pair[0], max_product_pair[1]))
else:
    print("No two numbers in the list have the same product.")
