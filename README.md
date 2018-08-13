# hacker-rank-qa
Hacker Rank interview question and answer

2nd answer
=================


	static String firstRepeatedWord(String s) {

		s = s.replace('\t', ' ');
		s = s.replace(',', ' ');
		s = s.replace(':', ' ');
		s = s.replace(';', ' ');
		s = s.replace('-', ' ');
		s = s.replace('.', ' ');
		//System.out.println(s);

		String[] bufferArray = s.split(" ");
		String buffer = "NO-MATCH";

		for(int cursor=0;cursor<bufferArray.length;cursor++) {
			for(int internalCursor=cursor+1;internalCursor<bufferArray.length;internalCursor++) {

				if(bufferArray[cursor].equals(bufferArray[internalCursor])) {
					buffer = bufferArray[cursor];
				}


			}
		}


		return buffer;
	}
