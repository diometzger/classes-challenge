public class Main {
    public static void main(String[] args) {
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;

        int howMuch = (int) Math.ceil(wallArea / areaPerBucket);

        int bucketsToBuy = howMuch - extraBuckets;

        return bucketsToBuy;
    }
     public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
            double wallArea = width * height;

         return (int) Math.ceil(wallArea / areaPerBucket);
     }

     public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
     }
}
