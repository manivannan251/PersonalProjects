shopping_list = ["milk","pasta","eggs","spam","bread","rice"]

#item_to_be_found="albatross"
item_to_be_found="bread"
found_at=None

# for index in range(len(shopping_list)):
#     if shopping_list[index]==item_to_be_found:
#         found_at=index
#         break

if item_to_be_found in shopping_list:
    found_at = shopping_list.index(item_to_be_found)


if found_at is not None:
    print("Item is found at position {}".format(found_at))
else:
    print("{} not found".format(item_to_be_found))

