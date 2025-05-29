class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList list= new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][i];
        }
        list.add(sum);
        Arrays.sort(b);
        list.add(b[b.length-1]);
        return list;
    }
}
