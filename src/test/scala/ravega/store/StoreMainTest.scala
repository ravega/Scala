package ravega.store

import utest._

object StoreMainTest extends TestSuite {

import StoreMain._
import ravega.store.StoreMain.*;

  def tests = TestSuite {
    'StoreMain {
      assert(square(0) == 0)
      assert(square(4) == 16)
      assert(square(-5) == 25)
    }
  }
}
