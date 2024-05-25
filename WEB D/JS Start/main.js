var form = document.getElementById('addForm');
var itemList = document.getElementById('items');

// form submit event

form.addEventListener('submit', addItem);

//add item
function addItem(e){
    e.preventDefault();
    //get entered val
    var newItem =  document.getElementById('item').value;

    //greate new li element
    var li= document.createElement('li');
    //add class
    li.className='list-group-item';
    //add text mode with input val
    li.appendChild(document.createTextNode(newItem));
    var button = document
    itemList.appendChild(li);
}