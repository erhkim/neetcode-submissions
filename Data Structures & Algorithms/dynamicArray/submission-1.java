class DynamicArray {

    private int[] arr;
    private int size = 0;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
    }

    public int get(int i) {
        if (i < this.size && i >= 0) {
            return this.arr[i];
        } else {
            return -1;
        }
    }

    public void set(int i, int n) {
        if (i < size && i >= 0) {
            this.arr[i] = n;
        }
    }

    public void pushback(int n) {
        if (this.size == this.getCapacity()) {
            this.resize();
        }

        this.arr[this.getSize()] = n;
        this.size++;
    }

    public int popback() {
        if (this.size <= 0) {
            return -1;
        }

        this.size--;
        return this.arr[this.size];
    }

    private void resize() {
        int[] newArr = new int[this.arr.length * 2];

        for (int i = 0; i < this.size; i++) {
            newArr[i] = this.arr[i];
        }

        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.arr.length;
    }
}
