package util

import sys.process._
import java.net.URL
import java.io.File

class HttpRequest {

  def fileDownloader(url: String, filename: String) = {
    new URL(url) #> new File(filename) !!
  }

}
