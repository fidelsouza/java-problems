package com.java1.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SymmetricMatrixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr = new String[] {"5","0","<>","0","3"};
		String ret = SymmetricMatrix(strArr);
		System.out.println("Return: "+ret);

	}

	public static String SymmetricMatrix(String[] strArr) {

		List<List<String>> rows = new ArrayList<>();

		List<Integer> rowsSize = new ArrayList<>();

		List<String> row = new ArrayList<>();

		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i].equals("<>")) {

				rows.add(row);
				rowsSize.add(row.size());

				row = new ArrayList<>();

			} else {
				row.add(strArr[i]);
			}
		}
		
		if(row.size()>0) {
			rows.add(row);
		}

		List<Integer> distinctRowsSize = rowsSize.stream().distinct().collect(Collectors.toList());
		if (distinctRowsSize.size() > 1) {
			return "not symmetric";
		}

		List<List<String>> transposeRows = new ArrayList<>();

		List<String> transposeRow = new ArrayList<>();
		// col
		for (int i = 0; i < distinctRowsSize.get(0) ; i++) {

			// line
			for (int j = 0; j < rows.size(); j++) {

				transposeRow.add(rows.get(j).get(i));

			}
			transposeRows.add(transposeRow);
			transposeRow = new ArrayList<>();
		}

		if (transposeRows.containsAll(rows)) {
			return "symmetric";
		}

		return "not symmetric";
	}

}
