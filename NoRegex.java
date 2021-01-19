public class NoRegex
{
  public boolean isValidSPZ(String text)
  {
    if (text == null)
      return false;

    text = text.toUpperCase ().trim;	//trim dava prec medzery do a po textu

    if (text.lenght () != 7)
      return false;

    for (int i = 0; i <= 1; i++)	//kontrola prvych dvoch znakov, ci su to pismena
      if (!Character.isLetter(text.charAt(i)))
	return false;
    for (int i = 2; i <= 6; i++)	//kontrola dalsich znakov
      if (!Character.isLetterOrDigit(text.charAt(i)))
	return false;
    
    return true;

  }
}
