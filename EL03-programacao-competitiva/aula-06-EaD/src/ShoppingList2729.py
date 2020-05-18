x = int(input())
for i in range(x):
  shoppingListString = input()
  shoppingListArray = shoppingListString.split(" ")
  uniqueShoppingList = list(dict.fromkeys(shoppingListArray))
  uniqueShoppingList.sort()
  uniqueShoppingListString = " ".join(uniqueShoppingList)
  print(uniqueShoppingListString)