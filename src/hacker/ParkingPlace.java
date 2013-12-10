package hacker;

/*
 * 
 * TODO:TLE
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingPlace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLong();
		int M = sc.nextInt();
		int K = sc.nextInt();
		Set<Long> park = new HashSet<Long>();
		while (M-- > 0) {
			park.add(sc.nextLong());
		}
		while (K-- > 0) {
			System.out.println(park.contains(sc.nextLong()) ? 1 : 0);
		}
	}
}
