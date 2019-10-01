/**
 * @(#) SujetMaisonBusiness.java 
 *
 * Copyright 2019 - Carrefour
 *
 * Created :30 sept. 2019 
 *
 *
*/
package com.sujet.maison.business;

import org.springframework.stereotype.Service;

/**
 * @description
 * 
 * @author Radwane EL HADDADI
 *
 * @email radwane_el_haddadi@carrefour.com
 *
 */
@Service
public class SujetMaisonBusiness implements SujetMaisonBusinessApi{

	
	@Override
	public int[][] partition(int[] list, int taille) {
		if(taille > 0 && list!= null && list.length > 0) {
			int[][] result;
			int i;
			int size = list.length/taille;
			if(list.length%taille == 0) {
				result = new int[size][];
				for(i = 0; i < size ; i++ ) {
					int[] a = new int[taille];
					for(int j =0; j < taille; j++) {
						a[j] = list[(i*taille)+j];				
					}
					result[i] = a;
				}
			} else {
				result = new int[size+1][];
				for(i = 0; i < size ; i++ ) {
					int[] a = new int[taille];
					for(int j =0; j<taille; j++) {
						a[j] = list[(i*(taille-1))+j];				
					}
					result[i] = a;
				}
					int s = list.length - taille*i;
					int[] b = new int[s];
					for(int k =i*taille; k < list.length; k++) {
						b[k-i*taille]= list[k];
					}
					result[size] = b;
			}
			return result;
		} else {
			return new int[][] {};
		}
	}
	
	
	/*
	 * to print partition method
	 * 
	 */
	@Override
	public String printPartition(int[] list, int taille) {
		int[][] partitions = partition(list, taille);
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int k;
		for( k =0 ; k<partitions.length-1;k++) {
			int[] i = partitions [k];
			builder.append("[");
			for(int j=0 ;j< i.length-1;j++){
				builder.append(i[j]+", ");
			}
			builder.append(i[i.length-1]+"], ");
		}
		int[] i = partitions [k];
		builder.append("[");
		for(int j=0 ;j< i.length-1;j++){
			builder.append(i[j]+", ");
		}
		builder.append(i[i.length-1]+"]]");
		return builder.toString();
	}
}
