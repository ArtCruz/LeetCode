class Solution {
    public boolean isValid(String s) {
        
        int num = 0;
        String proxnum = "";
        boolean resultado = false;
        boolean resultadoLogica = true;
        
        for(int i = 0; i < s.length() ; i++){
            
            switch(s.charAt(i)){
                case '(':
                    num += 1;
                    proxnum += "1"; 
                    break;
                case ')':
                    if(proxnum.endsWith("1")){
                        proxnum = proxnum.substring(0, proxnum.length() - 1);
                        num -= 1;
                    }else{
                        resultadoLogica = false;
                    }                            
                    break;
                case '[':
                    num += 2;
                    proxnum += "2"; 
                    break;
                case ']':
                    if(proxnum.endsWith("2")){
                        proxnum = proxnum.substring(0, proxnum.length() - 1);       
                        num -= 2;
                    }else{
                        resultadoLogica = false;
                    }     
                    break;
                case '{':
                    num += 3;
                    proxnum += "3"; 
                    break;
                case '}':
                    if(proxnum.endsWith("3")){
                        proxnum = proxnum.substring(0, proxnum.length() - 1);
                        num -= 3;
                    }else{
                        resultadoLogica = false;
                    }     
                    break;
            }
            
            System.out.println("L: "+proxnum);
            
        }
        
        if(num == 0 && resultadoLogica == true){
            resultado = true;
        }else{
            resultado = false;
        }
        
        return resultado;
        
    }
}