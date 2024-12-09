public class GPTAnswer {
    public static void main(String[] args) {
        // Test examples
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // Should return -1 (invalid width)
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));  // Should return 3 (valid parameters)
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Should return 3 (valid parameters)
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Validate parameters
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Return -1 for invalid values
        }

        // Calculate the area of the wall
        double wallArea = width * height;

        // Calculate the number of buckets required
        int totalBucketsNeeded = (int) Math.ceil(wallArea / areaPerBucket);

        // Subtract the extra buckets
        int bucketsToBuy = totalBucketsNeeded - extraBuckets;

        // Ensure no negative values (if extraBuckets are sufficient)
        return Math.max(bucketsToBuy, 0);
    }
}

