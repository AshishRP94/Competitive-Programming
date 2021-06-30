package competitive_programming;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dict, List<String> query) 
    {
        int count=0;
        String temp=null;
        List<Integer> ans=new ArrayList<>();  
        for(int i=0;i<query.size();i++)
        {
            temp=query.get(i);
            
            for(int j=0;j<dict.size();j++)
            {
                String temp2=dict.get(j);
                int x=0;
                boolean flag=false;
                int l=0;
                if(temp.length()==temp2.length())
                {
                    
               
                for(int t=0;t<temp2.length();t++)
                {
                    
                    for(x=0;x<temp.length();x++)
                    {
                        if(temp.charAt(x)==temp2.charAt(t))
                        {
                            flag=true;
                            break;
                            
                        }
                        
                        
                    }
                    if(flag==false)
                    {
                        break;
                    }
                    l+=1;
                    if(l==temp.length())
                    {
                        count+=1;
                        ans.add(count);
                        
                    }
                    
                    
                }
                }
            
            }
        
        
        }

    
    return ans;
    
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.stringAnagram(dictionary, query);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
