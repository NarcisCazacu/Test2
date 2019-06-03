package pachet1;

public class HomeworkEx2 {
    public static double distance (double lat1,
                                   double lat2,
                                   double lon1,
                                   double lon2)
    {
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat/2),2)
                + Math.cos (lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon/2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double r = 6371;

        return (c*r);
    }
    public static void main (String[] args)
    {
        double lat1 = 53.32055;
        double lat2 = 53.31861;
        double lon1 = -1.729722;
        double lon2 = -1.699782;
        System.out.println(distance(lat1, lat2, lon1, lon2) + "K.M");
    }
}
