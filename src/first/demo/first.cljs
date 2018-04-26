(ns demo.first)

(defn -main []
  (.trace js/console))

(set! *main-cli-fn* -main)
