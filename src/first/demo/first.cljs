(ns demo.first)

(.install (js/require "source-map-support"))

(defn -main []
  (.trace js/console))

(set! *main-cli-fn* -main)
