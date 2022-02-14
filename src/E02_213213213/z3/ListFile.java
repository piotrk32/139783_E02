package E02_213213213.z3;

import java.io.File;

public class ListFile
{
    public static File[] subDir(String path)
    {
        File dir = new File(path);
        File[] files = dir.listFiles((loc) -> loc.isDirectory());

        for (File f : files)
        {
            System.out.println(f);
        }
        return files;







    }
}
