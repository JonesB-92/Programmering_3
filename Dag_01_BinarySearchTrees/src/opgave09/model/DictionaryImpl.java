package opgave09.model;

public class DictionaryImpl<K extends Comparable<K>, V> implements Dictionary<K, V> {
    private TreeNode<K, V> root;
    private int size;

    @Override
    public V get(K key) {
        return get(key, root);
    }

    private V get(K key, TreeNode<K, V> current) {
        if (current == null) {
            return null;
        }
        //Hvis match
        if (current.key.compareTo(key) == 0) {
            return current.value;
        }
        //Hvis mindre end
        if (current.key.compareTo(key) < 0) {
            return get(key, current.left);
        } else {
            return get(key, current.left);
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public V put(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Key or value cannot be null");
        }
        if (root == null) {
            root = new TreeNode<>(key, value);
            size++;
            return null;
        }
        return null;
    }

    private V put(K key, V value, TreeNode<K, V> current, TreeNode<K, V> parent, boolean isLeft) {
        if (current.key.compareTo(key) == 0) {
            V oldValue = current.value;
            current.value = value;
            return oldValue;
        }

        //Termineringsregel
        if (current == null) {
            TreeNode<K, V> newNode = new TreeNode<>(key, value);
            size++;
            if (isLeft) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
            return null;
        }

        //Rekurrensregel
        if (current.key.compareTo(key) < 0) {
            return put(key, value, current.left, current, true);
        } else {
            return put(key, value, current.right, current, false);
        }
    }

    @Override
    public V remove(K key) {
        return null;
    }


    @Override
    public int size() {
        return size;
    }

    //Nodeklassen herinde for at forstærke indkapsulering
    class TreeNode<K, V> {
        private K key;
        private V value;

        //Træstruktur
        private TreeNode<K, V> left;
        private TreeNode<K, V> right;

        public TreeNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }
}
