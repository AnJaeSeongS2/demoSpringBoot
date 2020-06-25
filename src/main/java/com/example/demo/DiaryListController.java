package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Controller annotation으로 자동 컴포넌트 검색으로 DiaryListController를 발견해 자동으로 스프링 어플리케이션 컨텍스트에 빈으로 등록됨.
 * 요청으로 처리하는 모든 메서드를 기본 Url 경로인 /로 매핑하기위해 RequestMapping 어노테이션을 붙임.
 *
 * @github: http://github.com/sonanDev
 * @createdBy: jindam91@gmail.com
 * @created: 2020/06/20
 * @since: 1.8
 */
@Controller
@RequestMapping("/")
public class DiaryListController {

    private static final String user = "jaeseong";

    private DiaryListRepository diaryListRepository;

    @Autowired
    public DiaryListController(DiaryListRepository diaryListRepository) {
        this.diaryListRepository = diaryListRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String usersDiarys(Model model) {
        List<Diary> diaryList = diaryListRepository.findByUser(user);
        if (diaryList != null) {
            model.addAttribute("diarys", diaryList);
        }
        return "diaryList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addToReadingList(Diary diary) {
        diary.setUser(user);
        diaryListRepository.save(diary);
        return "redirect:/";
    }
}
