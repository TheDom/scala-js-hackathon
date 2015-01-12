package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.test.JasmineTest

object ScalaJSHackathonTest extends JasmineTest {

  describe("ScalaJSHackathon") {

    it("should implement square()") {
      import ScalaJSHackathon._

      expect(square(0)).toBe(0)
      expect(square(4)).toBe(16)
      expect(square(-5)).toBe(25)
    }
  }
}
