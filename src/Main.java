class Main {

  // Add any helper functions you may need here


  String rotationalCipher(String input, int rotationFactor) {
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      rotate(i, chars, rotationFactor);
    }

    return String.valueOf(chars);
  }

  void rotate(int i, char[] chars, int rf) {
    char c = chars[i];
    char newCh;

    if (c >= 'a' && c <= 'z') {
      newCh = (char) ((c - 'a' + rf) % 26 + 'a');
    } else if (c >= 'A' && c <= 'Z') {
      newCh = (char) ((c - 'A' + rf) % 26 + 'A');
    } else if (c >= '0' && c <= '9') {
      newCh = (char) ((c - '0' + rf) % 10 + '0');
    } else {
      return;
    }
    chars[i] = newCh;

    return;
  }

}