package life.echo.community.controller;

import life.echo.community.dto.QuestionDTO;
import life.echo.community.mapper.QuestionMapper;
import life.echo.community.model.Question;
import life.echo.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QusetionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/question/{id}")
    public String Question(@PathVariable(name="id")Integer id, Model model) {
        QuestionDTO questionDTO = questionService.getById(id);
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
