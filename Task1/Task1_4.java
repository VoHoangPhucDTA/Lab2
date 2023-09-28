package Task1;

public class Task1_4 {
	
	public static void moveTower(int disk, char source, char dest, char spare) {
		if (disk == 0) return;
		moveTower(disk-1, source, spare, dest);
		System.out.println("Move disk: " + disk + " from " + source + " to " + dest);
		moveTower(disk-1, spare, dest, source);
	}
	
	public static void main(String[] args) {
		int disk = 3;
		moveTower(disk, 'A', 'C', 'B');
	}
	
}