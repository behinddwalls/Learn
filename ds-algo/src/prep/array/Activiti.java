package prep.array;

public class Activiti {
	int start;
	int finish;
	static Activiti[] activitis = null;

	public static Activiti[] createActiviti(int arr[][], int n) {
		activitis = new Activiti[n];
		for (int i = 0; i < n; i++) {
			Activiti activiti = new Activiti();
			activiti.start = arr[i][0];
			activiti.finish = arr[i][1];
			activitis[i] = activiti;
		}
		return activitis;
	}

}
