import java.nio.ByteOrder

import com.intel.analytics.bigdl.nn._
import com.intel.analytics.bigdl.numeric.NumericFloat


object Main {
  def main(args: Array[String]): Unit = {
    val modelPath = "./deepspeech/models/output_graph.pb"
    val binPath = "./deepspeech/models/lm.binary"
    val inputs = Seq("input_node","input_lengths")
    val outputs = Seq("output_node")

    // For tensorflow freezed graph or graph without Variables
    val model = Module.loadTF(modelPath, inputs, outputs, ByteOrder.LITTLE_ENDIAN)

  }
}
