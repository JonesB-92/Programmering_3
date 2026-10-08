## Opgaver 

### Opgave 1

Implementer metoden `inorder(TreeNode<E> current)` i `BinarySearchTreeImpl` klassen. 
Den skal lave et gennemløb af træet og udskrive elementet af hver knude i inorder rækkefølge.

**Ekstra opgave**

Tilføj en ekstra parameter til `inorder(Consumer<TreeNode<E>> consumer)` metoden. Consumer 
er et funktionelt interface med metoden ``void accept(T t)``, så man kan kalde `inorder()` metoden 
med et lambda udtryk. 

Eksempel:

        binarySearchTree.inorder(t -> System.out.println(t.getElement() + " "));
        binarySearchTree.inorder(t -> t.setElement(t.getElement() + 10));
        binarySearchTree.inorder(t -> System.out.println(t.getElement() + " "));

---

### Opgave 2

Implementer en ``preorder`` metoder der gennemløber alle knuderne i træet i preorder rækkefølge
og udskriver elementerne til konsollen. 

---

### Opgave 3

Tilføj en metode ``minimumElement()`` der returnere det mindste element i træet.

---

### Opgave 4

Tilføj en metode ``maximumElement()`` der returnere det største element i træet.

*hint:* Dette kan gøres uden at sammenligne nogen elementer i træet.

---

### Opgave 5

Lav en metode ``height()`` der returnere højden af træet.

---

### Opgave 6

Lav en metode ``leafCount()`` der returnerer antallet af blade i træet. 

### Opgave 7

Lav en metode ``inorderList`` der returnerer en Liste med alle elementerne i træer 
i inorder rækkefølge, dvs. sorteret. 


