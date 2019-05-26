package BinarySearh;

class BinarySearch {
    public int methoodBinarySearch(int key, int[] array){
        int low = 0;
        int hight = array.length-1;
        int i = -0;
        while (low<=hight){
            int mid = (low + hight)/2;
            int posibleKey = mid;
            if (posibleKey==key){
                return mid;
            }
            if (posibleKey>key){
                hight = mid -1;
            } else {
                low = mid +1;
            }
        }
        return i;
    }
}