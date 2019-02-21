class Sort
{

  public void insertionSort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
      int prev_idx = i - 1;
      while (prev_idx >= 0 && arr[prev_idx] > arr[i]) {
        int temp = arr[prev_idx];
        arr[prev_idx] = arr[i];
        arr[i] = temp;
        prev_idx--;
        i--;
      }
    }
  }

  public void insertionStringSort(String[] arr){
    for (int i = 1; i < arr.length; i++) {
      int prev_idx = i - 1;
      while (prev_idx >= 0 && arr[prev_idx].compareTo(arr[i]) > 0) {
        String temp = arr[prev_idx];
        arr[prev_idx] = arr[i];
        arr[i] = temp;
        prev_idx--;
        i--;
      }
    }
  }
}
