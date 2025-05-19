package com.data.controller;

import com.data.model.Seat;
import com.data.model.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BookingController {

    // Hiển thị form đặt vé
    @GetMapping("/bookingForm")
    public String showBookingForm(Model model) {
        model.addAttribute("ticket", new Ticket());

        // Tạo danh sách ghế để người dùng chọn
        List<Seat> availableSeats = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            availableSeats.add(new Seat("A" + i));
        }
        model.addAttribute("availableSeats", availableSeats);

        return "bookingForm";
    }

    // Xử lý đặt vé
    @PostMapping("/bookTicket")
    public String bookTicket(@ModelAttribute Ticket ticket, Model model) {
        double pricePerSeat = 100000;
        int numberOfSeats = ticket.getSeats() != null ? ticket.getSeats().size() : 0;
        double total = pricePerSeat * numberOfSeats;
        ticket.setTotalAmount(total);
        model.addAttribute("ticket", ticket);
        return "bookingResult";
    }
}