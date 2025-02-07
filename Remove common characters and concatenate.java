StringBuilder sb=new StringBuilder();
        for(char c:s1.toCharArray()){
            if(!s2.contains(c+""))sb.append(c);
        }
        for(char c:s2.toCharArray()){
            if(!s1.contains(c+""))sb.append(c);
        }
        return sb.length()>0?sb.toString():"-1";
