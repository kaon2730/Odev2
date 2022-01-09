package odev;

import java.util.Scanner;

public class diziler {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Dizi icerisinde kontrol etmek istediginiz sayiyi giriniz");
		int kullanici = giris.nextInt();
		
		int [][] matris = new int[][] {
			{56,23,678,231},
			{234,21,78,26},
			{654,33,32,67},
			{189,35,56,89}
		};
		
		int[][] matris2 = new int[][] {
			{56,23,1,231},
			{234,21,78,26},
			{654,33,32,67},
			{189,35,56,89}
		};
		tekBoyutluDiziYazdirma(diziyiTekSayilarinaAyirma(matris));
		tekBoyutluDiziYazdirma(diziyiCiftSayilarinaAyirma(matris));
		System.out.println("En buyuk sayi:" + cokBoyutluDizideEnBuyukSayi(matris2));
		girilenDegerDizideVarmi(matris2, kullanici);
		
		
	}
	public static int[] diziyiTekSayilarinaAyirma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					count++;
				}
			}
		}
		int[] tekSayilarDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					tekSayilarDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return tekSayilarDizisi;
	}
	public static int[] diziyiCiftSayilarinaAyirma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					count++;
				}
			}
		}
		int[] ciftSayilarDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					ciftSayilarDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return ciftSayilarDizisi;
	}
	public static void tekBoyutluDiziYazdirma(int[] dizi) {
		for(int i=0; i<dizi.length; i++) {
			if(i<dizi.length-1) {
				System.out.print(dizi[i] + ", " );
			}
			else {
				System.out.print(dizi[i]);
			}
		}
		System.out.println();
	}
	public static int cokBoyutluDizideEnBuyukSayi(int[][] dizi) {
		int enBuyuk = dizi[0][0];
		for(int i=0; i<dizi.length; i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(enBuyuk < dizi[i][j]) {
					enBuyuk = dizi[i][j];
				}
			}
		}
		return enBuyuk;
	}
	public static void girilenDegerDizideVarmi(int[][] dizi, int a) {
		boolean x = false;
		for(int k =0; k<dizi.length; k++ ) {
			for(int l=0; l<dizi[0].length; l++) {
				if(a == dizi[k][l]) {
					x = true;
					break;
				}
			}
		}
		String durum;
		durum =  x ? "true" : "false";
		System.out.println(durum);
		
	}
}

