
public class HanoiPuzzle {
	public void TowerofHanoi(int n, char source, char destination, char auxiliary) {
		if (n == 1) {
			System.out.println("Move the " + n + " th disk from " + source + " to " + destination);
			return;
		} else {
			//move n-1 disk from source to auxiliary
		TowerofHanoi(n - 1, source, auxiliary, destination);
		//move the nth disk from source to destination
		System.out.println("Move the " + n + "th disk from " + source + " to " + destination);
		//move n-1 disk from source to destination
		TowerofHanoi(n - 1, auxiliary, destination, source);
		}
	}
}
