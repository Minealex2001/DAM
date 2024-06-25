def find_anagrams(list_of_strings):
    anagrams = {}
    for string in list_of_strings:

        sorted_string = "".join(sorted(string))

        if sorted_string not in anagrams:
            anagrams[sorted_string] = []

        anagrams[sorted_string].append(string)

    return anagrams


list_of_strings = ["eat", "tea", "dog", "god", "cat"]

anagrams = find_anagrams(list_of_strings)

for sorted_string, anagrams_list in anagrams.items():
    print(f"La cadena '{sorted_string}' tiene los siguientes anagramas: {anagrams_list}")
