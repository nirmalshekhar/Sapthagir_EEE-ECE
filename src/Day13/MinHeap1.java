package Day13;
public class MinHeap1 {
    int []heap;
    int size;
    MinHeap1(int capacity){
        heap=new int[capacity];
        size=0;
    }
    void insert(int val){
        heap[size]=val;
        int i=size;
        size++;
        while(i>0 &&heap[(i-1)/2]>heap[i]){
            int temp=heap[i];
            heap[i]=heap[(i-1)/2];
            heap[(i-1)/2]=temp;
            i=(i-1)/2;
        }
    }
    int extractMin(){
        if(size==0)return -1;
        int root=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify(0);
        return root;
    }
    void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int smallest=i;
        if(left<size && heap[left]<heap[smallest])
            smallest=left;
        if(right<size && heap[right]<heap[smallest])
            smallest=right;
        if(smallest!=i){
            int temp=heap[i];
            heap[i]=heap[smallest];
            heap[smallest]=temp;
            heapify(smallest);
        }
    }
    public static void main(String[] args) {
        MinHeap1 h=new MinHeap1(10);
        h.insert(50);
        h.insert(5);
        h.insert(30);
        h.insert(10);
        System.out.println("Extract min :"+h.extractMin());

    }
}
