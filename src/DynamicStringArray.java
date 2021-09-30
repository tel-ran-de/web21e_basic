public class DynamicStringArray {
    /*
    getLength() - length - длинна массива
    index - как способ получения нужного элемента
    get(index) - возвращать значение элемента array[index]
    add(index, String) - сохранять Строку под индексом. array[index]=newString
    add(String) - добавлять Строку в конец массива
    pop() - удалять последний элемент в массиве
     */
    private String arr[];
    private int current;
    private int capacity;

    public DynamicStringArray() {
        this.arr = new String[1];
        this.capacity = 1;
        this.current = 0;
    }

    public void add(String str) {
        if (this.current == this.capacity) {
            this.capacity *= 2;
            String tmp[] = new String[this.capacity];
            for (int i = 0; i < this.arr.length; i++) {
                tmp[i] = this.arr[i];
            }
            this.arr = tmp;
        }
        this.arr[this.current] = str;
        this.current++;
    }

    public void add(int index, String str) {
        if (index < this.current && index >= 0) {
            this.arr[index] = str;
        } else {
            this.add(str);
        }
    }

    public String get(int index) {
        return this.arr[index];
    }

    public int getLength() {
        return this.current;
    }

    public void pop() {
        this.current--;
    }

}
