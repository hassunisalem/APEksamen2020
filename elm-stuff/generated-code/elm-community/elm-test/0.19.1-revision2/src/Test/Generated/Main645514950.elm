module Test.Generated.Main645514950 exposing (main)

import Example

import Test.Reporter.Reporter exposing (Report(..))
import Console.Text exposing (UseColor(..))
import Test.Runner.Node
import Test

main : Test.Runner.Node.TestProgram
main =
    [     Test.describe "Example" [Example.suite] ]
        |> Test.concat
        |> Test.Runner.Node.run { runs = Nothing, report = (ConsoleReport UseColor), seed = 19726460192775, processes = 12, paths = ["C:\\Users\\hasss\\IdeaProjects\\APEksamen2020\\tests\\Example.elm"]}