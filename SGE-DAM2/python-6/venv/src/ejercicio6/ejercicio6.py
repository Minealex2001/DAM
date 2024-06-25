def is_superset(set_a, set_b):
    return set_a.issuperset(set_a) and set_a.issuperset(set_b)


def main():
    set_a = {1, 3, 4, 5, 7, 9}
    set_b = {3, 4, 5, 7}

    issuperset = is_superset(set_a, set_b)

    if is_superset:
        print("Set_a is a superset of itself and a superset of set_b.")
    else:
        print("Set_a is not a superset of itself and a superset of set_b.")


if __name__ == "__main__":
    main()
