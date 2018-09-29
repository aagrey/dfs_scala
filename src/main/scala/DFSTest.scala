import util.HttpRequest
import java.io.File

class DFSTest {

  val request: HttpRequest = new HttpRequest();

  val salaries: File = request.fileDownloader("https://www.draftkings.com/lineup/getavailableplayerscsv?contestTypeId=21&draftGroupId=21727", "salaries.csv");

}
