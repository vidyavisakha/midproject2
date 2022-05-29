import java.util.ArrayList;
import java.util.Scanner;

public class ProjectBNCC {
Scanner sc = new Scanner (System.in);
int menu = 0;
String kodemenu = " ";
String namamenu = " ";
double hargamenu = 0;
int stokmenu = 0;

ArrayList<String> Akodem = new ArrayList <String>();
ArrayList<String> Anamam = new ArrayList <String>();
ArrayList<Double> Ahargam = new ArrayList <Double>();
ArrayList<Integer> Astokm = new ArrayList <Integer>();

	public ProjectBNCC() {
	do {System.out.println("Selamat datang aplikasi database di PT Pudding");
		System.out.println("1. Insert data baru");
		System.out.println("2. View ");
		System.out.println("3. Update ");
		System.out.println("4. Delete ");
		System.out.print("Pilih: ");
		menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
			case 1:
				InsertData();
				break;
			case 2:
				System.out.println(Akodem);
				System.out.println(Anamam);
				System.out.println(Ahargam);
				System.out.println(Astokm);
				break;
			case 3:
				UpdateData ();
				break;
			case 4:
				DeleteData ();
				break;
		}
	
	}while (menu != 4);
	}

	private void InsertData () {
		System.out.print("Masukan kode menu: ");
		int min = 0;
		int max = 9;
		int range = max - min + 1;
		int random1 = (int)(Math.random()*range) +min;
		int random2 = (int)(Math.random()*range) +min;
		int random3 = (int)(Math.random()*range) +min;
		kodemenu = "PD-"+ random1+random2+random3;
		System.out.println(kodemenu);
		Akodem.add(kodemenu);
		
		System.out.print("Masukan nama menu: ");
		namamenu = sc.nextLine();
		Anamam.add(namamenu);
	
		System.out.print("Masukan harga menu: ");
		hargamenu = sc.nextDouble();sc.nextLine();
		Ahargam.add(hargamenu);
		
		System.out.print("Masukan stok menu: ");
		stokmenu = sc.nextInt();sc.nextLine();
		Astokm.add(stokmenu);

	}
	private void UpdateData () {
		System.out.print("Masukan index menu yang ingin diupdate: ");
		int update = sc.nextInt(); sc.nextLine();
		Akodem.get(update-1);
		Editdata ();
		}
	private void Editdata () {
		System.out.print("Masukan harga menu baru: ");
		hargamenu = sc.nextDouble();sc.nextLine();
		Ahargam.add(hargamenu);
		
		System.out.print("Masukan stok menu baru: ");
		stokmenu = sc.nextInt();sc.nextLine();
		Astokm.add(stokmenu);
		}
	private void DeleteData () {
		System.out.print("Masukan index menu yang ingin dihapus: ");
		int delete = sc.nextInt(); sc.nextLine();
		Akodem.remove(delete-1);
	    System.out.println("Menu dengan index ke- " + delete + " berhasil dihapus.");
		
	}

	
	public static void main(String[] args) {
		new ProjectBNCC ();

	}

}
