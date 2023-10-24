function addItemToList() {
	var inputElement = document.getElementById("listItem");

	var inputValue = inputElement.value;

	var newDiv = document.createElement("div");

	newDiv.textContent = inputValue;

	var itemList = document.getElementById("itemList");
	itemList.appendChild(newDiv);

	inputElement.value = "";
}

var addButton = document.getElementById("addItemButton");
addButton.addEventListener("click", addItemToList);