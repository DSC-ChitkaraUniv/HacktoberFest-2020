def selection_sort(ls):
    for i in range(len(ls)):
        min_index = i

        for j in range(i+1, len(ls)):
            if ls[j] < ls[min_index]:
                min_index = j

        ls[i], ls[min_index] = ls[min_index], ls[i]


if __name__ == "__main__":
    string_ls = input("Input list numbers separated by blank spaces:\n")
    ls = [int(x) for x in string_ls.strip().split(" ")]
    selection_sort(ls)
    print("Sorted list:")
    print(" ".join([str(x) for x in ls]))

